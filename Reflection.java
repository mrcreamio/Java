public class Reflection {
    public static void main(String[] args) {
        try{

            String pluginClass = "firstPlugin";
//            String pluginClass = "secondPlugin";
            plugin pg = (plugin) Class.forName(pluginClass).newInstance();
            String out = pg.manipulate("some string");
            System.out.println(out);
        }
        catch (InstantiationException e){
            e.printStackTrace();
        }
        catch (IllegalAccessException e){
            e.printStackTrace();
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }


    }
}

interface plugin{
    public String manipulate(String in);
}
class firstPlugin implements plugin{
    @Override
    public String manipulate(String in) {
        return in + " changed ";
    }
}
class secondPlugin implements plugin{
    @Override
    public String manipulate(String in) {
        return in + " changed by a lot ";
    }
}