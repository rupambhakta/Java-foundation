
class MovieTicket {
    // Implement your code here
    int movieId;
    int noOfSeats;
    double costPerticket;

    MovieTicket(int movieId,int noOfSeats){
        this.movieId = movieId;
        this.noOfSeats = noOfSeats;
    
    if(movieId==111){
        costPerticket=7;
    }else if(movieId==112){
        costPerticket=8;
    }else if(movieId==113){
        costPerticket=8.5;
    }else{
        System.out.println("Enter a valis movie id.");
    }
    }
    public double calculateTotalAmount() {
        double totalCost = (costPerticket*noOfSeats)+(((costPerticket*noOfSeats)*2)/100);
        Math.round(totalCost);
        return totalCost;
    }
}

class Tester1 {
    
    public static void main(String[] args) {
        MovieTicket movieTicket = new MovieTicket(113, 9);
        double amount = movieTicket.calculateTotalAmount();
        if (amount == 0)
            System.out.println("Sorry! Please enter valid movie Id and number of seats");
        else
            System.out.println("Total amount for booking : $" + amount);
    }
}