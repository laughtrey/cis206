/*
   File: Mountain.java
   Description: Mountain class project.
   Author: Raymond Laughrey
   Email: raymonl4963@student.vvc.edu
   Date of Creation: 6/4/2019, 1:01:48 AM
 */
public class Mountain{
  private String m_name, m_country;
  private Double m_elevation = 0.0;

  public Mountain(String name, String country, Double elevation){
    m_name = name;
    m_country = country;
    m_elevation = elevation;
  }
  public void setName(String name){
    m_name = name;
  }
  public void setCountry(String country){
    m_country = country;
  }
  public void setElevation(Double elevation){
    m_elevation = elevation;
  }
  public String getName(){
    return m_name;
  }
  public String getCountry(){
    return m_country;
  }
  public Double getElevation(){
    return m_elevation;
  }
  public Double toMeters(){
    final Double FEET_PER_METER = 3.2808;
    Double elevation_in_meters = (this.getElevation() / FEET_PER_METER);
    return elevation_in_meters;
  }
}
