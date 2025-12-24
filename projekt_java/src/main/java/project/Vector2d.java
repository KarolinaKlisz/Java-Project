package project;

public class Vector2d {
   private final int x;
   private final int y;

   public Vector2d(int x, int y){
       this.x = x;
       this.y = y;
   }

   public int getX(){
       return x;
   }

   public int getY(){
       return y;
   }

   @Override
   public String toString(){
       return "(" + this.x + "," + this.y + ")";
   }

   public boolean precedes(Vector2d other){
       return this.x <= other.x && this.y <= other.y;
   }

   public boolean follows(Vector2d other){
       return this.x >= other.x && this.y >= other.y;
   }

   public Vector2d add(Vector2d other){
       return new Vector2d(this.x + other.x, this.y + other.y);
   }

    public Vector2d subtract(Vector2d other){
        return new Vector2d(this.x - other.x, this.y - other.y);
    }

    public Vector2d upperRight(Vector2d other){

        int new_x;
        int new_y;

        new_x = Math.max(this.x, other.x);
        new_y = Math.max(this.y, other.y);

        return new Vector2d(new_x, new_y);
    }

    public Vector2d lowerLeft(Vector2d other){

        int new_x;
        int new_y;

        new_x = Math.min(this.x, other.x);
        new_y = Math.min(this.y, other.y);

        return new Vector2d(new_x, new_y);
    }

    public Vector2d opposite(){
       return new Vector2d(-this.x, -this.y);
    }

    @Override
    public boolean equals(Object other){
        if(!(other instanceof Vector2d that))
            return false;

        return this.x == that.getX() && this.y == that.getY();
    }

    @Override
    public int hashCode() {
        return 31 * x + y;
    }

}
