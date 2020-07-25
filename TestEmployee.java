class TestEmployee
{
    public static void main (String args[])
    {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();
        
        e1.name = "RobertWallsStreet";
        e1.year = 1994;
        e1.add = "64C-";
        
        e2.name = "Sam WallsStreet";
        e2.year = 2000;
        e2.add = "68D-";
        
        e3.name = "John WallsStreet";
        e3.year = 1999;
        e3.add = "26B-";
        
        System.out.println("Name\t\t  Year of joining\tAddress ");
        System.out.println(e1.name+"\t"+e1.year+"\t\t"+e1.add);
        System.out.println(e2.name+"\t\t"+e2.year+"\t\t"+e2.add);
        System.out.println(e3.name+"\t"+e3.year+"\t\t"+e3.add);
    }
}
