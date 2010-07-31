/* Licensed under the Apache License, Version 2.0 (the "License");
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
package org.activiti.engine.impl.cmd;

import org.activiti.engine.impl.interceptor.Command;
import org.activiti.engine.impl.interceptor.CommandContext;
import org.activiti.engine.impl.persistence.repository.ProcessDefinitionEntity;
import org.activiti.impl.definition.ProcessDefinitionImpl;


/**
 * @author Joram Barrez
 */
public class FindProcessDefinitionCmd implements Command<ProcessDefinitionEntity> {

  protected String processDefinitionId;
  
  public FindProcessDefinitionCmd(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
  }
  
  public ProcessDefinitionEntity execute(CommandContext commandContext) {
    return commandContext
      .getRepositorySession()
      .findProcessDefinitionById(processDefinitionId);
  }

}
