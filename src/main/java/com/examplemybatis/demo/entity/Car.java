package com.examplemybatis.demo.entity;

public class Car {
    private Long id;

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", start='" + start + '\'' +
                ", arrival='" + arrival + '\'' +
                ", belonger=" + belonger +
                '}';
    }

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column car.start
     *
     * @mbggenerated Wed Dec 04 13:04:16 CST 2019
     */
    private String start;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column car.arrival
     *
     * @mbggenerated Wed Dec 04 13:04:16 CST 2019
     */
    private String arrival;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column car.belonger
     *
     * @mbggenerated Wed Dec 04 13:04:16 CST 2019
     */
    private Long belonger;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table car
     *
     * @mbggenerated Wed Dec 04 13:04:16 CST 2019
     */
    public Car(Long id, String start, String arrival, Long belonger) {
        this.id = id;
        this.start = start;
        this.arrival = arrival;
        this.belonger = belonger;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table car
     *
     * @mbggenerated Wed Dec 04 13:04:16 CST 2019
     */
    public Car() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column car.id
     *
     * @return the value of car.id
     *
     * @mbggenerated Wed Dec 04 13:04:16 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column car.id
     *
     * @param id the value for car.id
     *
     * @mbggenerated Wed Dec 04 13:04:16 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column car.start
     *
     * @return the value of car.start
     *
     * @mbggenerated Wed Dec 04 13:04:16 CST 2019
     */
    public String getStart() {
        return start;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column car.start
     *
     * @param start the value for car.start
     *
     * @mbggenerated Wed Dec 04 13:04:16 CST 2019
     */
    public void setStart(String start) {
        this.start = start == null ? null : start.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column car.arrival
     *
     * @return the value of car.arrival
     *
     * @mbggenerated Wed Dec 04 13:04:16 CST 2019
     */
    public String getArrival() {
        return arrival;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column car.arrival
     *
     * @param arrival the value for car.arrival
     *
     * @mbggenerated Wed Dec 04 13:04:16 CST 2019
     */
    public void setArrival(String arrival) {
        this.arrival = arrival == null ? null : arrival.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column car.belonger
     *
     * @return the value of car.belonger
     *
     * @mbggenerated Wed Dec 04 13:04:16 CST 2019
     */
    public Long getBelonger() {
        return belonger;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column car.belonger
     *
     * @param belonger the value for car.belonger
     *
     * @mbggenerated Wed Dec 04 13:04:16 CST 2019
     */
    public void setBelonger(Long belonger) {
        this.belonger = belonger;
    }
}