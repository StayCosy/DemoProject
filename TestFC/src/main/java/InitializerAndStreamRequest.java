import com.aliyun.fc.runtime.Context;
import com.aliyun.fc.runtime.FunctionComputeLogger;
import com.aliyun.fc.runtime.FunctionInitializer;
import com.aliyun.fc.runtime.StreamRequestHandler;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InitializerAndStreamRequest implements StreamRequestHandler, FunctionInitializer {
    public void initialize(Context context) throws IOException {
        FunctionComputeLogger logger = context.getLogger();
        logger.debug(String.format("RequestID is %s %n", context.getRequestId()));
    }

    public void handleRequest(InputStream inputStream, OutputStream outputStream, Context context) throws IOException {
        FunctionComputeLogger logger = context.getLogger();
        logger.debug(String.format("RequestID is %s %n", context.getRequestId()));
        outputStream.write(new String("hello world!").getBytes());
        outputStream.flush();
    }
}
