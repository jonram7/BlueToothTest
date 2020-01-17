package com.example.bluetoothtest;

import androidx.appcompat.app.AppCompatActivity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;


import android.bluetooth.BluetoothSocket;
import android.os.Bundle;

import java.util.Set;
import java.util.UUID;

public class MainActivity extends AppCompatActivity {

    String address = null , name = null;
    
    BluetoothAdapter myBluetooth = null;
    BluetoothSocket btSocket = null;
    Set<BluetoothDevice> pairDevices;
    static final UUID myUUID = UUID.fromString ("00001101-0000-1000-8000-00805F9B34FB");"
       
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {setw();} catch {Exception e) {}

    }

    private void setw() {
    }
}
