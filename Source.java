public class Source
{
    public static void main(String[] args)
    {
        Container my_Container = new Container();
        for(int i=0;i<10;i++)
        {
            my_Container.append(i);
        }
        System.out.println(my_Container.length());
        for(int i=0;i<my_Container.length();++i)
        {
            System.out.println(my_Container.at(i));
        }

        my_Container.deleteAt(5);

        for(int i = 0; i < my_Container.length(); i++)
            System.out.println(my_Container.at(i));
    }
}