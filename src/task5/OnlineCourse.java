package task5;

public class OnlineCourse extends Course{
    String platform;
    int duration;

    public OnlineCourse(String courseName, String instructor, int credits,String platform, int duration)
    {
        super(courseName, instructor, credits);
        this.platform = platform;
        this.duration = duration;
    }

    public boolean isEligibleForCertificate()
    {
        return duration >= 10;
    }

    @Override
    public void display()
    {
        super.display();
        System.out.println("Platform: " + platform);
        System.out.println("Duration: " + duration + " hours");
        System.out.println("Certificate Eligible: " + isEligibleForCertificate());
    }
}
