package com.tiy.ssa.weekone.assignmentfour;

import java.util.ArrayList;
import java.util.List;

public class Knight {

    final Location home;
    Location current;
    List<Location> positions = new ArrayList<Location>();

    public Knight(Location home) {
        this.current = this.home = home;
    }

    public Location move() {

        if (isHome()) {
            this.current = this.current.offset(1, 2);
            positions.add(this.current);
            return this.current;
        } else {
            return this.current;
        }

    }

    public boolean isHome() {
        return current.equals(home);
    }

    public Location goHome() {

        this.current = this.current.offset(2, -1);
        positions.add(this.current);
        this.current = this.current.offset(-1, -2);
        positions.add(this.current);
        this.current = this.current.offset(-2, 1);
        positions.add(this.current);

        return this.current;
    }

    public Location getPosition() {
        return this.current;
    }

    public Location getStart() {
        return this.home;
    }
}
