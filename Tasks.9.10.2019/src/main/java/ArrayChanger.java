import java.util.ArrayList;
import java.util.List;

public  class ArrayChanger {
   // {1,2,8,-10,0,3,0,25} -> {0, 0 , 1,2,8,-10,3,25}

    public List<Integer> changArray(List<Integer> list){
       List<Integer> result = new ArrayList<Integer>();
         for (int i = 0; i < list.size(); i++) {
            if(list.get(i) == 0){
                result.add(list.get(i));
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) != 0){
                result.add(list.get(i));
            }
        }
        return result;
    }
}
