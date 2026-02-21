import javax.xml.transform.Source;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface  MyAnnotation {
    boolean onlyUpperCase() default false;
    int length() default -1;
    boolean onlyInt() default false;
}
