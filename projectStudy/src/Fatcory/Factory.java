package Fatcory;

/**
 * Created by Lidu on 18/4/21.
 */
public class Factory {
    public Fruit getFactoryByType(String type)
    {
        if(type==null)
            return null;

        if(type.equals("apple"))
        {
            return  new AppleFruit();
        }
        else if(type.equals("orange"))
        {
            return  new OrangeFruit();
        }
        else if(type.equals("grape"))
        {
            return  new GrapeFruit();
        }
        else {
            return null;
        }

    }
}
