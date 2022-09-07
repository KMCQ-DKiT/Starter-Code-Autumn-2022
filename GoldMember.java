

public class GoldMember extends Member {

    private int numberTreatments;


    public GoldMember( String name, int numberVisits,double costPerVisit)
    {



        super();
        this.numberTreatments=0;
        
        
    }

    public GoldMember(String name, int numberVisits,
                  double costPerVisit,int numberTreatments) {

        super(name, numberVisits, costPerVisit);

        this.numberTreatments=numberTreatments;
    }



    public int getNumberTreatments() {
        return numberTreatments;
    }

    public void setNumberTreatments(int numberTreatments) {
        this.numberTreatments = numberTreatments;
    }

    @Override
    public String toString() {
        return "GoldMember{" +
                "numberTreatments=" + numberTreatments +
                '}' + super.toString();
    }
}
