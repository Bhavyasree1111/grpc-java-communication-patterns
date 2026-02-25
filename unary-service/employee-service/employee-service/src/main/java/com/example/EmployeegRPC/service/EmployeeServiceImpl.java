package com.example.EmployeegRPC.service;

import com.example.employee.EmployeeServiceGrpc;
import com.example.employee.GetEmployeeByNameRequest;
import com.example.employee.GetEmployeeByNameResponse;
import io.grpc.stub.StreamObserver;
import org.springframework.grpc.server.service.GrpcService;

@GrpcService
public class EmployeeServiceImpl extends EmployeeServiceGrpc.EmployeeServiceImplBase {

    @Override
    public void getEmployeeByName(GetEmployeeByNameRequest request, StreamObserver<GetEmployeeByNameResponse> responseObserver) {
        String name = request.getName();

        // Simulate fetching employee details based on the name
        GetEmployeeByNameResponse response = GetEmployeeByNameResponse.newBuilder()
                .setName(name)
                .setEmail(name.toLowerCase() + "@example.com")
                .setPhone(1234567890)
                .setDepartment("Engineering")
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
    // guice
}
