 class FoodOrder {

    // OrderFood function for two items
    public static void OrderFood(String food1, int quantity1, String food2, int quantity2) {
        System.out.println("Ordering " + quantity1 + " of " + food1 + " and " + quantity2 + " of " + food2);
        // Add logic to place the order for the specified food items
    }

    // OrderFood function for three items
    public static void OrderFood(String food1, int quantity1, String food2, int quantity2, String food3, int quantity3) {
        System.out.println("Ordering " + quantity1 + " of " + food1 + ", " + quantity2 + " of " + food2 + ", and " + quantity3 + " of " + food3);
        // Add logic to place the order for the specified food items
    }

    // OrderFood function for four items
    public static void OrderFood(String food1, int quantity1, String food2, int quantity2, String food3, int quantity3, String food4, int quantity4) {
        System.out.println("Ordering " + quantity1 + " of " + food1 + ", " + quantity2 + " of " + food2 + ", " + quantity3 + " of " + food3 + ", and " + quantity4 + " of " + food4);
        // Add logic to place the order for the specified food items
    }

    public static void main(String[] args) {
        // Example usage
        OrderFood("Burger", 2, "Pizza", 1);
        OrderFood("Pasta", 2, "Salad", 1, "Coke", 3);
        OrderFood("Sushi", 4, "Ramen", 2, "Tempura", 1, "Green Tea", 2);
    }
}
