package be.intecbrussel;


public class Rectangle {
    private int x;
    private int y;
    private int d;
    private int area;
    private int perimeter;
    private int height;
    private int width;
    private int grow;

    public int amountOfObjects = 0;

    public Rectangle(int height, int width){
        this.setWidth(width);
        this.setHeight(height);
        amountOfObjects++;
    }





    public void setPosition(int xpos, int ypos){
        this.x = xpos;
        this.y = ypos;

    }

    public void setX(int x){
        this.x = x;

    }
    public void setY(int y){
        this.y = y;
    }

    public void setHeight(int height){
        if(this.height<0) {
            this.height *= -1;
        }else{
            this.height *= 1;
        }
        this.height = height;


    }
    public void setWidth(int width){
        if(this.width<0) {
            this.width *= -1;
        }else{
            this.width *= 1;
        }
        this.width = width;

    }
    public void setGrow(int d){
        this.height += d;
        this.width += d;
        if (this.height<0 && this.width<0){
            this.height = 0;
            this.width = 0;
        }
        grow = d;
    }
    public void newRectangle(int x, int y, int width, int height){
        x = this.x + 5;
        y = this.y + 5;
        width = this.width + 5;
        height = this.height + 5;
        System.out.println("\nx value of the new rectangle is: " + x);
        System.out.println("y value of the new rectangle is: " + y);
        System.out.println("width value of the new rectangle is: " + width);
        System.out.println("height value of the new rectangle is: " + height);
    }
    public static final int ANGLES = 4;

    public int getGrow() {return grow;}
    public int getArea(){ area = this.height * this.width; return this.area; }
    public int getPerimeter(){ this.perimeter = perimeter;perimeter = (this.height + this.width)*2; return this.perimeter; }
    public int getHeight(){ return height;}
    public int getWidth(){ return width; }
    public int getX(){ return this.x; }
    public int getY(){ return this.y; }

}
