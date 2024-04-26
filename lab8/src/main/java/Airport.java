import models.MilitaryType;
import Planes.*;

import java.util.*;
import java.util.stream.Collectors;
public class Airport {
    private final List<? extends Plane> planes; // Список самолетов

    public Airport(List<? extends Plane> planes) { // Конструктор
        this.planes = planes;
    }

    // Метод для получения пассажирских самолетов
    public List<PassengerPlane> getPasPl() {
        return planes.stream()
                .filter(plane -> plane instanceof PassengerPlane)
                .map(plane -> (PassengerPlane) plane)
                .collect(Collectors.toList());
    }

    // Метод для получения военных самолетов
    public List<MilitaryPlane> getMilitaryPlanes() {
        return planes.stream()
                .filter(plane -> plane instanceof MilitaryPlane)
                .map(plane -> (MilitaryPlane) plane)
                .collect(Collectors.toList());
    }

    // Метод для поиска пассажирского самолета с максимальной вместимостью
    public PassengerPlane getPassengerPlaneWithMaxPassengersCapacity() {
        return getPasPl().stream()
                .max(Comparator.comparingInt(PassengerPlane::getPassengersCapacity))
                .orElse(null);
    }

    // Метод для получения транспортных военных самолетов
    public List<MilitaryPlane> getTransportMilitaryPlanes() {
        return getMilitaryPlanes().stream()
                .filter(plane -> plane.getType() == MilitaryType.TRANSPORT)
                .collect(Collectors.toList());
    }

    // Метод для получения бомбардировщиков
    public List<MilitaryPlane> getBomberMilitaryPlanes() {
        return getMilitaryPlanes().stream()
                .filter(plane -> plane.getType() == MilitaryType.BOMBER)
                .collect(Collectors.toList());
    }

    // Метод для получения экспериментальных самолетов
    public List<experimentalPlane> getExperimentalPlanes() {
        List<experimentalPlane> experimentalPlanes = new ArrayList<>();
        for (Plane plane : planes) {
            if (plane instanceof experimentalPlane) {
                experimentalPlanes.add((experimentalPlane) plane);
            }
        }
        return experimentalPlanes;
    }

    public Airport sortByMaxDistance() {
        Collections.sort(planes, Comparator.comparingInt(Plane::Get_Max_Flight_Distance));
        return this;
    }

    public Airport sortByMaxSpeed() {
        Collections.sort(planes, Comparator.comparingInt(Plane::getMS));
        return this;
    }

    public Airport sortByMaxLoadCapacity() {
        Collections.sort(planes, Comparator.comparingInt(Plane::getMinLoadCapacity));
        return this;
    }

    private void print(Collection<? extends Plane> collection) {
        for (Plane plane : collection) {
            System.out.println(plane);
        }
    }

    @Override
    public String toString() {
        return "Airport{" +
                "Planes=" + planes +
                '}';
    }

    public List<? extends Plane> getPlanes() {
        return planes;
    }
}