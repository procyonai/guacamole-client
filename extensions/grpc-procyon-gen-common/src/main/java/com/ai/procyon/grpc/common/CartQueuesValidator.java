// Code generated by protoc-gen-validate. DO NOT EDIT.
// source: common.proto

package com.ai.procyon.grpc.common;

/**
* Validates {@code CartQueues} protobuf objects.
*/
public class CartQueuesValidator implements io.envoyproxy.pgv.ValidatorImpl<com.ai.procyon.grpc.common.CartQueues>{
	public static io.envoyproxy.pgv.ValidatorImpl validatorFor(Class clazz) {
		if (clazz.equals(com.ai.procyon.grpc.common.CartQueues.class)) return new CartQueuesValidator();
		
		return null;
	}
		
	
	

	public void assertValid(com.ai.procyon.grpc.common.CartQueues proto, io.envoyproxy.pgv.ValidatorIndex index) throws io.envoyproxy.pgv.ValidationException {
	
			io.envoyproxy.pgv.RepeatedValidation.forEach(proto.getCartQueueList(), item -> {
				
			// Validate CartQueue
			if (true) index.validatorFor(item).assertValid(item);
			});

	
	}

}

