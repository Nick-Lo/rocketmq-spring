/*
 * Copyright 2016 ZZJR All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Created on 2016年7月8日
// $Id$

package org.jobshen.mq.rocketmq.messages;

import org.jobshen.mq.rocketmq.message.DefaultMessage;


/**
 *
 * @author <a href="mailto:shenchenbo@zuozh.com">Shen.Chenbo</a>
 * @version 
 * @since JDK 1.6
 * Created on 2016年7月8日
 * Copyright 2016 ZZJR All Rights Reserved.
 */
public class TestMessage extends DefaultMessage<String>{

    public TestMessage(String topic, String tags){
        super(topic, tags);
    }

}
