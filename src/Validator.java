import java.lang.reflect.Field;
import java.util.Locale;

public class Validator {

    public static void validate(Object obj) throws IllegalAccessException
    {
        Class<?> clazz = obj.getClass();
        for (Field field : clazz.getDeclaredFields()){
            if (!field.isAnnotationPresent(MyAnnotation.class)) continue;

            MyAnnotation rule = field.getAnnotation(MyAnnotation.class);
            field.setAccessible(true);

            Object value = field.get(obj);

            if (rule.onlyInt() && field.getType()!=int.class)
            {
                throw new RuntimeException(
                        field.getName() + "must be only number"
                );
            }

            if (rule.length() > 0 && value instanceof String string)
            {
                if (string.length()!= rule.length()){
                    throw new RuntimeException(
                            field.getName() + " length must be " + rule.length()
                    );
                }
            }

            if (rule.onlyUpperCase() && value instanceof String string){
                if (!string.equals(string.toUpperCase()))
                {
                    throw new RuntimeException(
                            field.getName() + " must be uppercase"
                    );
                }
            }
        }
    }

}
