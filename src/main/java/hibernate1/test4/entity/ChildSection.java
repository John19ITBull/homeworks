package hibernate1.test4.entity;

import javax.persistence.*;

@Entity
@Table(name = "my_db.child_section")
public class ChildSection {

    @Id
    @Column(name = "child_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int childId;

    @Column(name = "section_id")
    private int sectionId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "child_id")
    private Children children;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "section_id")
    private Section section;

    public ChildSection() {
    }
    public int getChildId() {
        return childId;
    }

    public void setChildId(int childId) {
        this.childId = childId;
    }

    public int getSectionId() {
        return sectionId;
    }

    public void setSectionId(int sectionId) {
        this.sectionId = sectionId;
    }

    @Override
    public String toString() {
        return "ChildSection{" +
                "childId=" + childId +
                ", sectionId=" + sectionId +
                '}';
    }
}
