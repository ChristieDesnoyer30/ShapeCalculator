package com.company;

public class Calculator {


    private double shapeHeight;
    private double shapeWidth;
    private String shape;


    public double getShapeHeight() {
        return shapeHeight;
    }

    public void setShapeHeight(double shapeHeight) {
        this.shapeHeight = shapeHeight;
    }

    public double getShapeWidth() {
        return shapeWidth;
    }

    public void setShapeWidth(double shapeWidth) {
        this.shapeWidth = shapeWidth;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }


    public void calculateArea(String shape, double shapeHeight, double shapeWidth){

        double area = 0.0;

        if (shape.equalsIgnoreCase("triangle")){

            System.out.println("The area of a triangle is : " + ((shapeHeight * shapeWidth)/2));


        }
        else if (shape.equalsIgnoreCase("rectangle")){

            System.out.println("The area of a rectangle is : " + (shapeHeight * shapeWidth));

        }

        else {

            System.out.println("Not a valid shape");
        }


    }

}
