package Concepts;


import org.testng.annotations.DataProvider;

public class windowhandles {

    // Define the DataProvider method
    @DataProvider(name = "testData")
    public Object[][] createData() {
        return new Object[][] {
            { "data1", 1},
            { "data2", 2 },
            { "data3", 3 }
        };
    }

    // Define the test method and use the DataProvider
    @org.testng.annotations.Test(dataProvider = "testData")
    public void testMethod(String data, int number) {
        System.out.println("Data: " + data + ", Number: " + number);
    }
}

