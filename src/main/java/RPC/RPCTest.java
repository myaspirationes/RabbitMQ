package RPC;
import java.io.IOException;
import java.util.concurrent.*;
import java.util.concurrent.TimeoutException;

public class RPCTest {

    public static void main(String[] args) throws IOException, TimeoutException, InterruptedException {
        for( int i=0;1<100;i++){
            RPCClient rpcClient = new RPCClient();
            System.out.println(rpcClient.call("3"));
            TimeUnit.MILLISECONDS.sleep(1000);
        }
    }

}

