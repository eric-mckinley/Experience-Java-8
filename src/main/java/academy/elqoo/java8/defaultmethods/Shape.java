package academy.elqoo.java8.defaultmethods;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public interface Shape {


    void setXPos(int xPOs);

    void setYPos(int yPos);

    default String getName(){
        return "";
    }

    default int getXPos(){
        return 10;
    }

    default int getYPos(){
        return 10;
    }

    default String notImplemented(){
        throw new NotImplementedException();
    }


}
