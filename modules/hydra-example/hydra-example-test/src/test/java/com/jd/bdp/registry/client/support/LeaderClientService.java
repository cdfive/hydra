/*
 * Copyright jd
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.jd.bdp.registry.client.support;

import com.jd.bdp.hydra.dubbomonitor.LeaderService;

import java.util.List;
import java.util.Map;

/**
 * User: biandi
 * Date: 13-4-10
 * Time: 下午4:12
 */

/*针对业务接入单点的一个注册实体（只会收到一次注册请求）*/
public class LeaderClientService implements LeaderService{
    @Override
    public Map<String, String> registerClient(String name, List<String> services) {
        System.out.println("业务方开始发起注册请求~") ;
        return null;
    }

    @Override
    public String registerClient(String name, String service) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}