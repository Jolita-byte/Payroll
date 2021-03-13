package schedule;

import java.time.LocalDateTime;

public class EmployeeScheduleLine {
    private Integer id;
    private Integer employeeID;
    private String shiftCodeID;
    private String timeCodeID;
    private LocalDateTime beginDateTime;
    private LocalDateTime endDateTime;

    public EmployeeScheduleLine(Integer id, Integer employeeID, String shiftCodeID, String timeCodeID, LocalDateTime beginDateTime, LocalDateTime endDateTime) {
        this.id = id;
        this.employeeID = employeeID;
        this.shiftCodeID = shiftCodeID;
        this.timeCodeID = timeCodeID;
        this.beginDateTime = beginDateTime;
        this.endDateTime = endDateTime;
    }

    public EmployeeScheduleLine(Integer employeeID, String shiftCodeID, String timeCodeID, LocalDateTime beginDateTime, LocalDateTime endDateTime) {
        this.employeeID = employeeID;
        this.shiftCodeID = shiftCodeID;
        this.timeCodeID = timeCodeID;
        this.beginDateTime = beginDateTime;
        this.endDateTime = endDateTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(Integer employeeID) {
        this.employeeID = employeeID;
    }

    public String getShiftCodeID() {
        return shiftCodeID;
    }

    public void setShiftCodeID(String shiftCodeID) {
        this.shiftCodeID = shiftCodeID;
    }

    public String getTimeCodeID() {
        return timeCodeID;
    }

    public void setTimeCodeID(String timeCodeID) {
        this.timeCodeID = timeCodeID;
    }

    public LocalDateTime getBeginDateTime() {
        return beginDateTime;
    }

    public void setBeginDateTime(LocalDateTime beginDateTime) {
        this.beginDateTime = beginDateTime;
    }

    public LocalDateTime getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(LocalDateTime endDateTime) {
        this.endDateTime = endDateTime;
    }
}
