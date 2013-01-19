package org.jclouds.openstack.swift.config;

import static org.jclouds.reflect.Reflection2.typeTokenOf;

import org.jclouds.openstack.swift.CommonSwiftAsyncClient;
import org.jclouds.openstack.swift.CommonSwiftClient;
import org.jclouds.openstack.swift.SwiftKeystoneAsyncClient;
import org.jclouds.openstack.swift.SwiftKeystoneClient;
import org.jclouds.rest.ConfiguresRestClient;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Scopes;

/**
 *
 * @author Adrian Cole
 */
@ConfiguresRestClient
public class SwiftKeystoneRestClientModule extends SwiftRestClientModule<SwiftKeystoneClient, SwiftKeystoneAsyncClient> {

   public SwiftKeystoneRestClientModule() {
      super(typeTokenOf(SwiftKeystoneClient.class), typeTokenOf(SwiftKeystoneAsyncClient.class), ImmutableMap
               .<Class<?>, Class<?>> of());
   }

   protected void bindResolvedClientsToCommonSwift() {
      bind(CommonSwiftClient.class).to(SwiftKeystoneClient.class).in(Scopes.SINGLETON);
      bind(CommonSwiftAsyncClient.class).to(SwiftKeystoneAsyncClient.class).in(Scopes.SINGLETON);
  }
}
