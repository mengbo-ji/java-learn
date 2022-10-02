package com.atguigu.java;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author jimengbo
 * @create 2022-10-02 11:19 PM
 */
public class TCPTest1 {
  @Test
  public void client() throws IOException {
    OutputStream os = null;
    Socket socket = null;
    try {
      InetAddress inet = InetAddress.getByName("127.0.0.1");
      socket = new Socket(inet, 5372);
      os = socket.getOutputStream();
      os.write("你好，我是客户端".getBytes());

      os.close();
      socket.close();
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      if (os != null) {
        try {
          os.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
      if (socket != null) {
        try {
          socket.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }
  }
  @Test
  public void server() throws IOException {
    ServerSocket ss = null;
    Socket socket = null;
    InputStream inputStream = null;
    ByteArrayOutputStream baos = null;
    try {
      ss = new ServerSocket(5372);

      socket = ss.accept();

      inputStream = socket.getInputStream();

      baos = new ByteArrayOutputStream();
      byte[] buffer = new byte[5];
      int len;
      while ((len = inputStream.read(buffer)) != -1) {
        baos.write(buffer, 0, len);
      }

      System.out.println(baos.toString());
      System.out.println("收到了来自于" + socket.getInetAddress().getHostAddress() + "的数据");


    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      if(ss != null) {
        try {
          ss.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
      if(ss != null) {
        try {
          ss.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
      if(inputStream != null) {
        try {
          inputStream.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
      if(socket != null) {
        try {
          socket.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
      if(baos != null) {
        try {
          baos.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }

  }
}
