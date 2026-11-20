package com.jagrosh.discordipc.entities.pipe;
import org.newsclub.net.unix.AFUNIXSocketAddress;
import org.newsclub.net.unix.AFUNIXSocket;

import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.jagrosh.discordipc.IPCClient;
import com.jagrosh.discordipc.entities.Callback;
import com.jagrosh.discordipc.entities.Packet;
import com.jagrosh.discordipc.entities.Packet.OpCode;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.rusherhack.command.connect;
import org.rusherhack.command.send;
public class UnixPipe extends Pipe {
    public static Logger LOGGER = LoggerFactory.getLogger(UnixPipe.class);
    AFUNIXSocket socket = AFUNIXSocket.newInstance();

    UnixPipe(IPCClient var1, HashMap<String, Callback> var2, File var3) throws IOException {
        super(var1, var2);
        this.socket.connect(AFUNIXSocketAddress.m101(var3));
    }

    @Override
    public Packet read() throws IOException, JsonParseException {
        return null;
    }

    @Override
    public void write(byte[] var1) throws IOException {
        
    }

    @Override
    public void close() throws IOException {
        
    }

    public boolean mkdir(String var1) {
        return false;
    }

    @Override
    public void registerApp(String var1, String var2) {
        
    }

    @Override
    public void registerSteamGame(String var1, String var2) {
        
    }
}
