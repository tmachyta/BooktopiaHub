package booktopiahub.service.role;

import booktopiahub.model.Role;
import booktopiahub.model.Role.RoleName;

public interface RoleService {
    Role getRoleByRoleName(RoleName roleName);
}
