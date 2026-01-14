package edu.noel.martinez.act1.process;

public class Switch {
    private boolean isOn;

    public void prenderSwitch() { this.isOn=true; }

    public void apagarSwitch() {this.isOn=false; }

    public boolean isOn(){
        return this.isOn;
    }}