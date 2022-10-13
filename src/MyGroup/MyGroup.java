package MyGroup;

public class MyGroup {
    public String name;
    public String tlf;
    public String eMail;

    public Gender value;

    public String getName() {
        gruppeMedlem();
        return name;
    }
    public void setName(String newname) {
        this.name = newname;
    }
    public String getTlf() {
        gruppeMedlem();
        return tlf;
    }
    public void setTlf(String newtlf) {
        this.tlf = newtlf;
    }
    public String geteMail() {
        gruppeMedlem();
        return eMail;
    }
    public void seteMail(String neweMail) {
        this.eMail = neweMail;
    }
    public void gruppeMedlem() {
        setName("Oliver");
        setTlf("555");
        seteMail("Oliver@");
        value=Gender.MAN;
    }
    public Gender getValue() {
        return value;
    }
}