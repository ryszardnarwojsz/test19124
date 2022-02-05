public class ModuloThree {

    public boolean isDividedByThee(int number){
       boolean isDivided = true;

       try{ if (number % 3 !=0) throw new IllegalArgumentException();
       }
        catch(IllegalArgumentException e){
           isDivided = false;
        }
        return isDivided;

    }
}
