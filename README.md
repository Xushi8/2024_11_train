## 2024年11月实训后端

### 接口设置
- **端口**: `8070`

---

### 接口文档

#### Users
- ##### `insert_user`
  - **描述**: 新增一个用户
  - **参数**: 一个 `User` 对象

- ##### `delete_user_by_ID`
  - **描述**: 删除指定 ID 的用户
  - **参数**: 一个 `int` 值，名称为 `ID`

- ##### `delete_user_by_IDS`
  - **描述**: 删除指定数组中的多个用户
  - **参数**: 一个 `int` 数组，名称随意

- ##### `update_user`
  - **描述**: 修改用户信息
  - **参数**: 一个 `User` 对象

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

---

#### Tenants
- ##### `select_all_tenants`
  - **描述**: 返回所有租户
  - **参数**: 无

---

#### Projects
- ##### `select_all_projects`
  - **描述**: 返回所有项目
  - **参数**: 无

- ##### `select_all_project_users`
  - **描述**: 返回所有项目用户
  - **参数**: 无
