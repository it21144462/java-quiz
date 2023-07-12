class RoomChargeCalculator{

  private int balco;
  private int park;
  private int tv;
  private int kitc;
  private int wifi;
  private int ac;
  private int gard;
  private int basefee;

  //DEFAULT
  public RoomChargeCalculator(){

      int balco = 0;
      int park = 0;
      int tv = 0;
      int kitc = 0;
      int wifi = 0;
      int ac = 0;
      int gard = 0;
      int basefee=0;
  }
  public int getChargeDeluxDouble(boolean pbalco, boolean ppark, boolean ptv, boolean pkitc, boolean pwifi)
  {
        this.basefee = 5000;
        //ASSIGNING
        if(pbalco == true)
        {
            this.balco = 500;
        }
        if(ppark == true)
        {
           this.park = 200;
        }
        if(ptv == true)
        {
            this.tv = 200;
        }
        if(pkitc == true)
        {
            this.kitc = 1000;
        }
        if(pwifi == true)
        {
            this.wifi = 100;
        }
        
        return (this.basefee + this.balco + this.park +  this.tv +  this.kitc +  this.wifi); //RETURNIG THE VALUES
        

  }

    public int getChargeStandardFamily(boolean ppark, boolean pkitc, boolean pgard)
    {
        this.basefee = 3000;
        //ASSIGNING
        if(ppark == true)
        {
           this.park = 200; 
        }
        if(pkitc == true)
        {
           this.kitc = 500;
        }
        if(pgard == true)
        {
           this.gard = 200; 
        }

        return (this.basefee + this.park + this.kitc + this.gard);  //RETURNIG THE VALUES
        
    }

    public int getChargeStandardSingle(boolean ppark, boolean pac, boolean pwifi)
    {
        this.basefee = 2000;
        //ASSIGNING
        if(ppark == true)
        {
           this.park = 200;
        }
        if(pac == true)
        {
           this.ac = 500; 
        }
        if(pwifi == true)
        {
           this.wifi = 100; 
        }

        return (this.basefee + this.park + this.ac + this.wifi); //RETURNIG THE VALUES
        

    }


  
}  

//IT21144462-THARUSHA RANASINGHE