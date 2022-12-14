package demo2;

import classTipleri.Yetiskin;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class JavaDEmo {

    static int a = -4;
    static int b = 3;
    public static void main(String[] args) {

       //deneme();
      //  list();
        //array();
       // set();
        map();
    }

    public static void deneme(){

        System.out.println(a);
        System.out.println(b);
        if(b > 0 && a + b > 0 && getCondition()){
            System.out.println("durum saglandı");
        }
        System.out.println(a);
        System.out.println(a++);
        System.out.println(++a);
        System.out.println(a--);
        System.out.println(--a);
        int x = 4;
        int y = ++x;
        System.out.println(y);
        System.out.println(x);
    }


    public static boolean getCondition(){

        boolean sonuc = a>b;
        if(a < 0){
            a =0;
        }
        return sonuc;
    }

    public static void list(){

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(3);
        for (int i: list){
            System.out.println(i);
        }
/**
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        list.forEach(i -> System.out.println(i));
 */
//list.parallelStream().forEach(i -> System.out.println(i));
        List<Integer> integerList = list;
        integerList.remove(0);
        System.out.println("list after");
        for (int i: list){
            System.out.println(i);
        }
        System.out.println("ıntegerList");
        for (int i: integerList){
            System.out.println(i);
        }
        integerList.add(0,5);
        System.out.println("ıntegerList after");
        for (int i: integerList){
            System.out.println(i);
        }
        System.out.println("ıntegerList2");
        List<Integer> integerList2 = new ArrayList<>(list);
        integerList2.add(6);
        for (int i: integerList2){
            System.out.println(i);
        }
        System.out.println("--------");
        for (int i: list){
            System.out.println(i);
        }
        System.out.println("--------");
        List<Integer> integerList1 = new ArrayList<>();
        integerList1.addAll(list);
        Collections.sort(integerList1);
        integerList1.sort(Collections.reverseOrder());
       // Collections.reverse(integerList1);
        for (int i: integerList1){
            System.out.println(i);
        }
    }

    public static void array(){


        int[] myArray = {1,2,3,4};
        Integer[] array2 = new Integer[5];
        Random random = new Random();
        int a;
        for (int i = 0;i < array2.length; i++){
            a = myArray[random.nextInt(myArray.length)];
            array2[i] = a;
            //System.out.println(a);
        }
        for (Integer integer : array2) {
            System.out.println(integer);
        }
        List<Integer> list = Arrays.asList(array2);
        System.out.println(list);
    }

    public static void set(){

        HashSet<Object> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("A");
        set.add("C");
        set.add(1);
        set.add(true);
        set.add('c');
        Yetiskin yetiskin = new Yetiskin();
        set.add(yetiskin);
        set.add(yetiskin);
        Yetiskin yetiskin2 = new Yetiskin();
        set.add(yetiskin2);

        for (Object s : set) {
            System.out.println(s);
        }
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("A");
        treeSet.add("B");
        treeSet.add("C");
        treeSet.add("C");
        for (String s : treeSet) {
            System.out.println(s);
        }
    }

    public static void map(){

        HashMap<String,Integer> map = new HashMap<>();
        map.put("Bir",1);
        map.put("İki",2);
        map.put("Uc",3);
        System.out.println(map);
        System.out.println(map.get("İki"));
        System.out.println(System.currentTimeMillis());
        System.out.println(map.get("Bir"));
        System.out.println(System.currentTimeMillis());
        HashMap<Object,Object> objectMap = new HashMap<>();
        objectMap.put(1,"a");
        objectMap.put('1',true);
        objectMap.put("1",false);
        objectMap.put(true,'a');
        objectMap.put("pi",3.14);
        objectMap.put("deger",null);
        if (objectMap.containsKey("pi")){
            System.out.println(objectMap.get("pi"));
            objectMap.remove("pi");
        }
        System.out.println(objectMap.containsKey("pi"));

        for (Object o : objectMap.keySet()) {
            System.out.println("key: " + o + " value: " + objectMap.get(o));
        }

        ConcurrentHashMap<String,Integer> concurrentHashMap = new ConcurrentHashMap<>();
        //concurrentHashMap.put("a",null);
        System.out.println(concurrentHashMap.toString());
        List<Integer> list = new ArrayList<>();
        for (int i=0; i< 1000; i++){
            list.add(i);
        }
        list.parallelStream().forEach(i -> concurrentHashMap.put(""+ i, i));
        System.out.println(concurrentHashMap.size());
        HashMap<String,Integer> map2 = new HashMap<>();
        list.parallelStream().forEach(i -> map2.put(""+ i, i));
        System.out.println(map2.size());
    }

}
