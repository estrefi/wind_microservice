# wind_microservice

This is a Java REST API to manage wind turbines in Denmark
# Business Logic

## Roles
- Admin — full system access
- Manager — manages locations, tasks and technicians
- Technician — views and updates tasks in their locations

---

## Admin
1. Can add, edit and delete turbines
2. Can add, edit and delete locations
3. Can create manager and technician accounts
4. Has full read access to everything

---

## Manager
1. Oversees many locations (one manager per location)
2. Can view all turbines in their locations only
3. Can create tasks for turbines in their locations
4. Can assign and reassign technicians to tasks
5. Can only assign technicians who work in the same location
6. Can mark a task as COMPLETED
7. Cannot delete tasks

---

## Technician
1. Works in one or more assigned locations
2. Can view turbines in their assigned locations only
3. Can update the status of tasks assigned to them
4. Cannot reassign tasks to other technicians
5. Cannot create or delete tasks
6. Cannot delete tasks

---

## Tasks
1. Created by a manager only
2. Must be linked to at least one turbine
3. Can only be assigned to technicians in the same location as the turbine
4. Status flow: SCHEDULED → IN_PROGRESS → COMPLETED
5. Cannot be deleted — only completed
6. Cannot be reassigned by a technician

---

## Turbines
1. Created, edited and deleted by admin only
2. Must belong to an existing location
3. Status: ACTIVE, OFFLINE, MAINTENANCE
4. A task can only be created for a turbine
   that is OFFLINE or MAINTENANCE

---
