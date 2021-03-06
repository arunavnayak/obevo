/**
 * Copyright 2017 Goldman Sachs.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.gs.obevo.db.impl.platforms.h2;

import java.util.Collection;

import com.gs.obevo.db.api.platform.DbDeployerAppContext;
import com.gs.obevo.db.impl.core.changeauditdao.SameSchemaChangeAuditDaoTest;
import org.eclipse.collections.api.block.function.primitive.IntToObjectFunction;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class H2SameSchemaChangeAuditDaoTest extends SameSchemaChangeAuditDaoTest {
    @Parameterized.Parameters
    public static Collection<Object[]> params() {
        return H2ParamReader.getParamReader().getAppContextParams();
    }

    public H2SameSchemaChangeAuditDaoTest(IntToObjectFunction<DbDeployerAppContext> getAppContext) {
        super(getAppContext);
    }
}
