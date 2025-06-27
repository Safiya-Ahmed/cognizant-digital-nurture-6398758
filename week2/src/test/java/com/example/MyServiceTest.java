package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    public void testExternalApi() {
        // Mock the ExternalApi
        ExternalApi mockApi = mock(ExternalApi.class);

        // Stub the method to return mock data
        when(mockApi.getData()).thenReturn("Mock Data");

        // Inject mock into the service
        MyService service = new MyService(mockApi);

        // Call the method and assert the result
        String result = service.fetchData();
        assertEquals("Mock Data", result);
    }
 @Test
    public void testVerifyInteraction() {
        // Create a mock of ExternalApi
        ExternalApi mockApi = mock(ExternalApi.class);

        // Inject mock into the service
        MyService service = new MyService(mockApi);

        // Call the method
        service.fetchData();

        // Verify that getData() was called
        verify(mockApi).getData();
    }
}

