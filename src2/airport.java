import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


class airport {

    private String id;
    private int capacity;

    private ArrayList<String> flights;
    private HashMap<String, Integer> airplanes;

    airport() {
        this.airplanes = new HashMap<String, Integer>();
        this.flights = new ArrayList<String>();
    }

    void Airport_panel() {
        System.out.println();
        System.out.println("Choose operation:");
        System.out.println("[1] Add airplane");
        System.out.println("[2] Add flight");
        System.out.println("[x] Exit");
    }

    void Airport_panel_head(){
        System.out.println("Airport panel");
        System.out.println("-----------------");
        System.out.println();
    }

    void AddAirplane(String id, int capacity) {
        this.airplanes.put(id, capacity);
    }

    void printPlanes() {
        for (Map.Entry<String, Integer> entry : airplanes.entrySet()) {
            System.out.println(entry.getKey() + " (" + entry.getValue() + " ppl)");
        }
    }

    void AddFlight(String id, String departure, String destination) {
        String flight = "(" + departure + "-" + destination + ")";

        int plane_capacity = this.airplanes.get(id);

        flights.add(id + " (" + plane_capacity + " ppl) " + flight);
    }

    void printFlights() {
        for (String flight : flights) {
            System.out.println(flight);
        }
    }

    void printPlaneInfo(String id) {
        int value = this.airplanes.get(id);
        System.out.println(id + " (" + value + " ppl)");
    }


    void Flight_service() {
        System.out.println();
        System.out.println("Choose operation:");
        System.out.println("[1] Print planes");
        System.out.println("[2] Print flights");
        System.out.println("[3] Print plane info");
        System.out.println("[x] Exit");
    }

    void Flight_service_head(){
        System.out.println("Flight service");
        System.out.println("-----------------");
        System.out.println();
    }



    void start() {
        Airport_panel_head();
        Scanner reader = new Scanner(System.in);


        while (true) {
            Airport_panel();
            String input = reader.nextLine();

            if (input.equals("1")) {
                System.out.print("Give plane ID: ");
                String id = reader.nextLine();

                System.out.print("Give plane capacity: ");
                int capacity = Integer.parseInt(reader.nextLine());

                AddAirplane(id, capacity);

            } else if (input.equals("2")) {
                System.out.print("Give plane ID: ");
                String id = reader.nextLine();

                System.out.print("Give departure airport code: ");
                String departure = reader.nextLine();

                System.out.print("Give destination airport code: ");
                String destination = reader.nextLine();

                AddFlight(id, departure, destination);

            } else if (input.equals("x")) {
                break;
            }


        }

        Flight_service_head();

        while (true) {
            Flight_service();
            String input = reader.nextLine();

            if (input.equals("1")) {
                printPlanes();
            } else if (input.equals("2")) {
                printFlights();
            } else if (input.equals("3")) {
                System.out.print("Give plane ID: ");
                String id = reader.nextLine();
                printPlaneInfo(id);
            } else if (input.equals("x")) {
                break;
            }
        }
    }


}
