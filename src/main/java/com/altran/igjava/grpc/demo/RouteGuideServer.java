package com.altran.igjava.grpc.demo;

import io.grpc.stub.StreamObserver;

public class RouteGuideServer {

    private static class RouteGuideService extends RouteGuideGrpc.RouteGuideImplBase {

        @Override
        public void getFeature(Point request, StreamObserver<Feature> responseObserver) {
            super.getFeature(request, responseObserver);
        }
    }

}
