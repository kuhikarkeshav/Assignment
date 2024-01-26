import java.util.*;

public class RouteGrouping {
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        Map<Integer, List<String>> groupedRoutes = groupRoutesByFare(getInputData());

        System.out.println("Fare \t\t Route");
        for (Map.Entry<Integer, List<String>> entry : groupedRoutes.entrySet()) {
            System.out.println(entry.getKey() + "\t\t" + entry.getValue());
        }
    }

    private static Map<Integer, List<String>> groupRoutesByFare(String[] inputData) {
        Map<Integer, List<String>> fareToRoutesMap = new HashMap<>();

        for (String routeData : inputData) {
            String[] parts = routeData.split("\\s+"); 
            if (parts.length == 2) {
                String route = parts[0];
                int fare = Integer.parseInt(parts[1]);

                fareToRoutesMap.computeIfAbsent(fare, k -> new ArrayList<>()).add(route);
            }
        }

        return fareToRoutesMap;
    }

    private static String[] getInputData() {
        return new String[]{
                "13      	10",
                "13-C       15",
                "342-R   	10",
                "146-Q   	10",
                "27      	15",
                "29-A  		12",
                "215-U   	12",
                "27-E1    	15",
                "13J     	12",
                "SBS-D34G   10"
        };
    }
}
