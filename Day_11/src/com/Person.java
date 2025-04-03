package com;

public class Person {
    //public mean : access is possible from the same Class , same package, other packages, the World
    public String publicId = "public Id";
    // protected mean: access is possible from the same Class , same package
    protected String protectedId = "protected Id";

    // private mean:  access is possible from the same Class
    private String privateId = "private Id";

    // no modifier (default) mean: access is possible from the same Class , same package
    String defaultId = "defaultId";


    public void showPublicIds(){
        System.out.println(publicId);

    }
    protected void  showProtectedIds(){
        System.out.println(protectedId);
    }
    private void  showPrivateIds(){
        System.out.println(privateId);
    }

    void showDefaultId(){
        System.out.println(defaultId);
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.showPrivateIds();
    }
}
