public class Football {

    String fName;
    String sName;
    String tName;
    String fthName;
    String fhName;

    public Football(String fName, String sName, String tName, String fthName, String fhName){
        this.fName=fName;
        this.sName=sName;
        this.tName=tName;
        this.fthName=fthName;
        this.fhName=fhName;

    }

    @Override
    public String toString() {
        return "Football{" +
                "fName='" + fName + '\'' +
                ", sName='" + sName + '\'' +
                ", tName='" + tName + '\'' +
                ", fthName='" + fthName + '\'' +
                ", fhName='" + fhName + '\'' +
                '}' + "\n";
    }
}
