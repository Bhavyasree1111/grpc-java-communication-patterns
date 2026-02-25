package com.employee.employeeClient.service;

import com.example.employee.EmployeeServiceGrpc;
import com.example.employee.GetEmployeeByNameRequest;
import com.example.employee.GetEmployeeByNameResponse;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

@Service
public class EmployeeClientService {

    @GrpcClient("employeeService")
    private EmployeeServiceGrpc.EmployeeServiceBlockingStub stub;

        public GetEmployeeByNameResponse getEmployeeByName(String name) {
        GetEmployeeByNameRequest request = GetEmployeeByNameRequest.newBuilder().setName(name).build();
        return stub.getEmployeeByName(request);
    }
}
