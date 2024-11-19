## 2024年11月实训后端

### 接口设置
- **端口**: `8070`

---

### 接口文档

#### Users
- ##### `insert_user`
  - **描述**: 新增一个用户
  - **参数**: 一个 `User` 对象, 名称为 `user`

- ##### `delete_user_by_ID`
  - **描述**: 删除指定 ID 的用户
  - **参数**: 一个 `int` 值，名称为 `ID`

- ##### `delete_user_by_IDS`
  - **描述**: 删除指定数组中的多个用户
  - **参数**: 一个 `int` 数组，名称为 `IDS`

- ##### `update_user`
  - **描述**: 修改用户信息
  - **参数**: 一个 `User` 对象, 名称为 `user`

- ##### `select_all_users`
  - **描述**: 返回所有用户
  - **参数**: 无

- ##### `select_user_by_ID`
  - **描述**: 返回指定 ID 的用户
  - **参数**: 一个 `int` 值，名称为 `ID`

- ##### `select_user_by_Name`
  - **描述**: 返回指定名称的用户
  - **参数**: 一个 `String` 值，名称为 `Name`

- ##### `select_user_by_Name_and_Password`
  - **描述**: 返回指定名称和密码的用户
  - **参数**: 两个 `String` 值，名称分别为 `Name` 和 `Password`

- ##### `select_users_by_project_id`
  - **描述**: 返回指定指定项目 ID 下的所有User
  - **参数**:  一个 `int` 值，名称为 `ID`

---

#### Tenants
- ##### `insert_tenant`
  - **描述**: 新增一个租户
  - **参数**: 一个 `Tenant` 对象, 名称为 `tenant`

- ##### `delete_tenant_by_ID`
  - **描述**: 删除指定 ID 的租户
  - **参数**: 一个 `int` 值，名称为 `ID`

- ##### `delete_tenants_by_IDS`
  - **描述**: 删除指定数组中的多个租户
  - **参数**: 一个 `int` 数组，名称为 `IDS`

- ##### `update_tenant`
  - **描述**: 修改租户信息
  - **参数**: 一个 `Tenant` 对象, 名称为 `tenant`

- ##### `select_all_tenants`
  - **描述**: 返回所有租户
  - **参数**: 无

- ##### `select_tenant_by_ID`
  - **描述**: 返回指定 ID 的租户
  - **参数**: 一个 `int` 值，名称为 `ID`

- ##### `select_tenant_by_Name`
  - **描述**: 返回指定名称的租户
  - **参数**: 一个 `String` 值，名称为 `Name`

- ##### `select_tenant_by_Name_and_Password`
  - **描述**: 返回指定名称和密码的租户
  - **参数**: 两个 `String` 值，名称分别为 `Name` 和 `Password`

---

#### Projects
- ##### `insert_project`
  - **描述**: 新增一个项目
  - **参数**: 一个 `Project` 对象, 名称为 `project`

- ##### `delete_project_by_ID`
  - **描述**: 删除指定 ID 的项目
  - **参数**: 一个 `int` 值，名称为 `ID`

- ##### `delete_project_by_IDS`
  - **描述**: 删除指定数组中的多个项目
  - **参数**: 一个 `int` 数组，名称为 `IDS`

- ##### `update_project`
  - **描述**: 修改项目信息
  - **参数**: 一个 `Project` 对象, 名称为 `project`

- ##### `select_all_projects`
  - **描述**: 返回所有的项目
  - **参数**: 无

- ##### `select_project_by_ID`
  - **描述**: 返回指定 ID 的项目
  - **参数**: 一个 `int` 值，名称为 `ID`

- ##### `select_project_by_Name`
  - **描述**: 返回指定名称的项目
  - **参数**: 一个 `String` 值，名称为 `Name`

- ##### `select_projects_by_tenant_id`
  - **描述**: 返回指定指定租户 ID 下的所有项目
  - **参数**:  一个 `int` 值，名称为 `ID`
