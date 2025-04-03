package main;

public class Box {

    double width, height, depth;

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public Box(double width, double height){
        this.width = width;
        this.height = height;
    }

    public Box() {
    }

    public double getVolume() {
        return this.width * this.height * this.depth;
    }
}
