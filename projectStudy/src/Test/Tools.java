package Test;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Lidu on 18/5/20.
 */
public class Tools {
    public char[] getCharArray(String str)
    {
        if(str==null)
        {
            return null;
        }

        char[] charArray = str.toCharArray();
        return charArray;
    }


    public Map<String,Integer> getStringDataInfo(char[] charData)
    {
        Map<String,Integer> dataMap = new TreeMap<>();
        if(charData.length == 0)
        {
            return null;
        }
        for(int i=0;i<charData.length;i++)
        {

            String charKey = String.valueOf(charData[i]);
            if(dataMap.containsKey(charKey))
            {
                dataMap.replace(charKey,dataMap.get(charKey),dataMap.get(charKey)+1);
            }
            else
            {
                dataMap.put(charKey,1);
            }
        }
        return dataMap;

    }
}
