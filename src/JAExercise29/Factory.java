package JAExercise29;

public class Factory {


    public String returnShape(VariousShapes variousShapes){
        Shape result = null ;
        if(variousShapes == VariousShapes.Triangle){
            result = new Triangle();
        } else if (variousShapes == VariousShapes.Rectangle) {
            result = new Rectangle();
        }
        else{
            System.out.println("You have inserted an incorrect shape");
        }
        return result.draw();
    }
}
