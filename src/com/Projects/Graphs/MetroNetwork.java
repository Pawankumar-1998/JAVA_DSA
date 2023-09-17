package com.Projects.Graphs;

import java.util.*;

class MetroStation {
    String name;
    Map<MetroStation, Integer> connections;
    int distance;

    public MetroStation(String name) {
        this.name = name;
        this.connections = new HashMap<>();
        this.distance = Integer.MAX_VALUE;
    }

    public void addConnection(MetroStation station, int distance) {
        connections.put(station, distance);
    }

    public String getName() {
        return name;
    }
}

public class MetroNetwork {
    Map<String, MetroStation> stations;

    public MetroNetwork() {
        this.stations = new HashMap<>();
    }

    public void addStation(String name) {
        stations.put(name, new MetroStation(name));
    }

    public void addConnection(String from, String to, int distance) {
        MetroStation station1 = stations.get(from);
        MetroStation station2 = stations.get(to);

        if (station1 != null && station2 != null) {
            station1.addConnection(station2, distance);
            station2.addConnection(station1, distance);
        } else {
            System.out.println("Invalid station name(s). Please check and try again.");
        }
    }

    public static class ShortestPathResult {
        private List<String> path;
        private int distance;

        public ShortestPathResult(List<String> path, int distance) {
            this.path = path;
            this.distance = distance;
        }

        public List<String> getPath() {
            return path;
        }

        public int getDistance() {
            return distance;
        }
    }

    public ShortestPathResult findShortestPath(String start, String end) {
        PriorityQueue<MetroStation> pq = new PriorityQueue<>(Comparator.comparingInt(station -> station.distance));
        Map<MetroStation, MetroStation> previousStations = new HashMap<>();

        for (MetroStation station : stations.values()) {
            if (station.name.equals(start)) {
                station.distance = 0;
            } else {
                station.distance = Integer.MAX_VALUE;
            }
            pq.offer(station);
        }

        while (!pq.isEmpty()) {
            MetroStation currentStation = pq.poll();

            if (currentStation.name.equals(end)) {
                break;
            }

            for (Map.Entry<MetroStation, Integer> entry : currentStation.connections.entrySet()) {
                MetroStation neighbor = entry.getKey();
                int distanceToNeighbor = entry.getValue();
                int totalDistance = currentStation.distance + distanceToNeighbor;

                if (totalDistance < neighbor.distance) {
                    neighbor.distance = totalDistance;
                    previousStations.put(neighbor, currentStation);
                    pq.remove(neighbor);
                    pq.offer(neighbor);
                }
            }
        }

        List<String> shortestPath = new ArrayList<>();
        MetroStation current = stations.get(end);

        while (current != null) {
            shortestPath.add(0, current.name);
            current = previousStations.get(current);
        }

        int shortestDistance = stations.get(end).distance;

        return new ShortestPathResult(shortestPath, shortestDistance);
    }

    public static void main(String[] args) {
        MetroNetwork metro = new MetroNetwork();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Metro Network Menu:");
            System.out.println("1. Add Station");
            System.out.println("2. Add Connection");
            System.out.println("3. Find Shortest Path");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter the name of the station to add: ");
                    String stationName = scanner.nextLine();
                    metro.addStation(stationName);
                    System.out.println("Station '" + stationName + "' added.");
                    break;
                case 2:
                    System.out.print("Enter the name of the first station: ");
                    String fromStation = scanner.nextLine();
                    System.out.print("Enter the name of the second station: ");
                    String toStation = scanner.nextLine();
                    System.out.print("Enter the distance between them: ");
                    int distance = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    metro.addConnection(fromStation, toStation, distance);
                    System.out.println("Connection added between '" + fromStation + "' and '" + toStation + "'.");
                    break;
                case 3:
                    System.out.print("Enter the start station: ");
                    String startStation = scanner.nextLine();
                    System.out.print("Enter the end station: ");
                    String endStation = scanner.nextLine();
                    ShortestPathResult result = metro.findShortestPath(startStation, endStation);
                    List<String> shortestPath = result.getPath();
                    int shortestDistance = result.getDistance();
                    System.out.println("Shortest Path: " + shortestPath);
                    System.out.println("Shortest Distance: " + shortestDistance);
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
