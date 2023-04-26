package Activity36;

public class Test {
    public static void main(String[] args) {
        public class CustomerRecordTest {
            public static void main(String[] args) {
                CustomerRecord customerRecord = new CustomerRecord();

                Customer customer1 = new Customer("John", "Doe", "123 Main St");
                Customer customer2 = new Customer("Jane", "Smith", "456 Oak Ave");

                customerRecord.addCustomer(customer1);
                customerRecord.addCustomer(customer2);

                System.out.println(customerRecord.getAllCustomers());
            }
        }

    }
}
