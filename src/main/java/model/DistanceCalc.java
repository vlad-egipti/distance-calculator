package model;

import java.math.BigDecimal;

public class DistanceCalc {
    public static double calcCrowflightDist(City c1, City c2) {
        final int EARTH_RADIUS = 6371;
        BigDecimal lat1 = c1.getLatitude();
        BigDecimal lon1 = c1.getLongitude();
        BigDecimal lat2 = c2.getLatitude();
        BigDecimal lon2 = c2.getLongitude();

        double dLon = Math.toRadians(lon2.subtract(lon1).doubleValue());
        double dLat = Math.toRadians(lat2.subtract(lat1).doubleValue());
        double lt1 = Math.toRadians(lat1.doubleValue());
        double lt2 = Math.toRadians(lat2.doubleValue());
        double clt1 = Math.cos(lt1);
        double clt2 = Math.cos(lt2);

        double a = Math.pow(Math.sin(dLat / 2), 2) + clt1 * clt2 * Math.pow(Math.sin(dLon / 2), 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        return c * EARTH_RADIUS;
    }
}
